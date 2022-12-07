(ns ogbe.fulcro.mui.icons.face-outlined
  #?(:cljs (:require
            ["@mui/icons-material/FaceOutlined" :default FaceOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-face-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FaceOutlined)))