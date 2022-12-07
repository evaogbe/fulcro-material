(ns ogbe.fulcro.mui.icons.terminal-outlined
  #?(:cljs (:require
            ["@mui/icons-material/TerminalOutlined" :default TerminalOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-terminal-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TerminalOutlined)))