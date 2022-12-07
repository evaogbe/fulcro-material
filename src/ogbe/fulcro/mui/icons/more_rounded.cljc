(ns ogbe.fulcro.mui.icons.more-rounded
  #?(:cljs (:require
            ["@mui/icons-material/MoreRounded" :default MoreRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-more-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MoreRounded)))