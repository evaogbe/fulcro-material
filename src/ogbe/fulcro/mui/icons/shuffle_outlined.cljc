(ns ogbe.fulcro.mui.icons.shuffle-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ShuffleOutlined" :default ShuffleOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-shuffle-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShuffleOutlined)))