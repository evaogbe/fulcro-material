(ns ogbe.fulcro.mui.icons.replay-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ReplayRounded" :default ReplayRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-replay-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ReplayRounded)))