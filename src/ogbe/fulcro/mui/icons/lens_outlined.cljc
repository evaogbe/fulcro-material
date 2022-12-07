(ns ogbe.fulcro.mui.icons.lens-outlined
  #?(:cljs (:require
            ["@mui/icons-material/LensOutlined" :default LensOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-lens-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LensOutlined)))