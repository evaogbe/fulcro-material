(ns ogbe.fulcro.mui.icons.fiber-smart-record
  #?(:cljs (:require
            ["@mui/icons-material/FiberSmartRecord" :default FiberSmartRecord]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-fiber-smart-record
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FiberSmartRecord)))