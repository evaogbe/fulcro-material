(ns ogbe.fulcro.mui.icons.hmobiledata
  #?(:cljs (:require
            ["@mui/icons-material/HMobiledata" :default HMobiledata]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hmobiledata
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HMobiledata)))