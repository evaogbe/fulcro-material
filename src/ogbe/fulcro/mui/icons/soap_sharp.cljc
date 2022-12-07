(ns ogbe.fulcro.mui.icons.soap-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SoapSharp" :default SoapSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-soap-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SoapSharp)))