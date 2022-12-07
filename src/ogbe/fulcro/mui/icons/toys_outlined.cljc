(ns ogbe.fulcro.mui.icons.toys-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ToysOutlined" :default ToysOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-toys-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ToysOutlined)))