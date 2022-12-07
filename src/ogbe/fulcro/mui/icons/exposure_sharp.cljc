(ns ogbe.fulcro.mui.icons.exposure-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ExposureSharp" :default ExposureSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-exposure-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ExposureSharp)))