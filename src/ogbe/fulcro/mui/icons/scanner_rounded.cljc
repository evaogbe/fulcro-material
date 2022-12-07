(ns ogbe.fulcro.mui.icons.scanner-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ScannerRounded" :default ScannerRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-scanner-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ScannerRounded)))