(ns ogbe.fulcro.mui.icons.exposure
  #?(:cljs (:require
            ["@mui/icons-material/Exposure" :default Exposure]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-exposure
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Exposure)))