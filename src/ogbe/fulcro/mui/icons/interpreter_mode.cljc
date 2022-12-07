(ns ogbe.fulcro.mui.icons.interpreter-mode
  #?(:cljs (:require
            ["@mui/icons-material/InterpreterMode" :default InterpreterMode]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-interpreter-mode
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory InterpreterMode)))