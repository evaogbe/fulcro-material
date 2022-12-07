(ns ogbe.fulcro.mui.icons.pause-outlined
  #?(:cljs (:require
            ["@mui/icons-material/PauseOutlined" :default PauseOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pause-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PauseOutlined)))