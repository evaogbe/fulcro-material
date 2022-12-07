(ns ogbe.fulcro.mui.icons.category-outlined
  #?(:cljs (:require
            ["@mui/icons-material/CategoryOutlined" :default CategoryOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-category-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CategoryOutlined)))