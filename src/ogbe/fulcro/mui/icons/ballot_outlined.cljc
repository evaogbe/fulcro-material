(ns ogbe.fulcro.mui.icons.ballot-outlined
  #?(:cljs (:require
            ["@mui/icons-material/BallotOutlined" :default BallotOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-ballot-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BallotOutlined)))