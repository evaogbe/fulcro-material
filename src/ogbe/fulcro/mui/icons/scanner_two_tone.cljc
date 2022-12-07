(ns ogbe.fulcro.mui.icons.scanner-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/ScannerTwoTone" :default ScannerTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-scanner-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ScannerTwoTone)))