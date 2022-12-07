(ns ogbe.fulcro.mui.icons.scanner
  #?(:cljs (:require
            ["@mui/icons-material/Scanner" :default Scanner]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-scanner
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Scanner)))