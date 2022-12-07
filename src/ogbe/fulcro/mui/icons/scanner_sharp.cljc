(ns ogbe.fulcro.mui.icons.scanner-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ScannerSharp" :default ScannerSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-scanner-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ScannerSharp)))