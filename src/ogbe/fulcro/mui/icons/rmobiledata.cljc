(ns ogbe.fulcro.mui.icons.rmobiledata
  #?(:cljs (:require
            ["@mui/icons-material/RMobiledata" :default RMobiledata]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-rmobiledata
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RMobiledata)))