(ns ogbe.fulcro.mui.icons.man-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ManOutlined" :default ManOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-man-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ManOutlined)))