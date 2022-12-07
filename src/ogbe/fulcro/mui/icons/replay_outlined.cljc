(ns ogbe.fulcro.mui.icons.replay-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ReplayOutlined" :default ReplayOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-replay-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ReplayOutlined)))