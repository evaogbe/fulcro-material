(ns ogbe.fulcro.mui.icons.troubleshoot
  #?(:cljs (:require
            ["@mui/icons-material/Troubleshoot" :default Troubleshoot]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-troubleshoot
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Troubleshoot)))