(ns ogbe.fulcro.mui.icons.poll-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PollRounded" :default PollRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-poll-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PollRounded)))