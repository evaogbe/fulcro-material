(ns ogbe.fulcro.mui.icons.replay
  #?(:cljs (:require
            ["@mui/icons-material/Replay" :default Replay]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-replay
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Replay)))