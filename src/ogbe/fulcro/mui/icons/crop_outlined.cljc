(ns ogbe.fulcro.mui.icons.crop-outlined
  #?(:cljs (:require
            ["@mui/icons-material/CropOutlined" :default CropOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-crop-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CropOutlined)))