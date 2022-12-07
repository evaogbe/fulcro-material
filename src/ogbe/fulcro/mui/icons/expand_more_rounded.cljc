(ns ogbe.fulcro.mui.icons.expand-more-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ExpandMoreRounded" :default ExpandMoreRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-expand-more-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ExpandMoreRounded)))