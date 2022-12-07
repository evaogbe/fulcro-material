(ns ogbe.fulcro.mui.icons.more-time
  #?(:cljs (:require
            ["@mui/icons-material/MoreTime" :default MoreTime]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-more-time
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MoreTime)))