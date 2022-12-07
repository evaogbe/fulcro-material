(ns ogbe.fulcro.mui.icons.read-more-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ReadMoreOutlined" :default ReadMoreOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-read-more-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ReadMoreOutlined)))