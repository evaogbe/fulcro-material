(ns ogbe.fulcro.mui.icons.terminal-sharp
  #?(:cljs (:require
            ["@mui/icons-material/TerminalSharp" :default TerminalSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-terminal-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TerminalSharp)))