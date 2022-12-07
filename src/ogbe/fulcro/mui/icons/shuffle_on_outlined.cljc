(ns ogbe.fulcro.mui.icons.shuffle-on-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ShuffleOnOutlined" :default ShuffleOnOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-shuffle-on-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShuffleOnOutlined)))