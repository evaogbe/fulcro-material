(ns ogbe.fulcro.mui.icons.scanner-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ScannerOutlined" :default ScannerOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-scanner-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ScannerOutlined)))