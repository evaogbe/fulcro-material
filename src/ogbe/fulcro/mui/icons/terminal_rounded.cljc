(ns ogbe.fulcro.mui.icons.terminal-rounded
  #?(:cljs (:require
            ["@mui/icons-material/TerminalRounded" :default TerminalRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-terminal-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TerminalRounded)))