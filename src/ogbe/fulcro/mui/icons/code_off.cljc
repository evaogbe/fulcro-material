(ns ogbe.fulcro.mui.icons.code-off
  #?(:cljs (:require
            ["@mui/icons-material/CodeOff" :default CodeOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-code-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CodeOff)))