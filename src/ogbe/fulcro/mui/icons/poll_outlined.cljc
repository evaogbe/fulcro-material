(ns ogbe.fulcro.mui.icons.poll-outlined
  #?(:cljs (:require
            ["@mui/icons-material/PollOutlined" :default PollOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-poll-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PollOutlined)))