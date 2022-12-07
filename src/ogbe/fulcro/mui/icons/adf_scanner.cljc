(ns ogbe.fulcro.mui.icons.adf-scanner
  #?(:cljs (:require
            ["@mui/icons-material/AdfScanner" :default AdfScanner]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-adf-scanner
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AdfScanner)))