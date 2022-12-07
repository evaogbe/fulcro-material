(ns ogbe.fulcro.mui.icons.class-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ClassOutlined" :default ClassOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-class-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ClassOutlined)))