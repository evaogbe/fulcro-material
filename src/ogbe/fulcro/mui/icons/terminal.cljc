(ns ogbe.fulcro.mui.icons.terminal
  #?(:cljs (:require
            ["@mui/icons-material/Terminal" :default Terminal]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-terminal
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Terminal)))