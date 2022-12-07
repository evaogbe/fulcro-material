(ns ogbe.fulcro.mui.icons.title-outlined
  #?(:cljs (:require
            ["@mui/icons-material/TitleOutlined" :default TitleOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-title-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TitleOutlined)))