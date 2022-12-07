(ns ogbe.fulcro.mui.icons.science-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ScienceOutlined" :default ScienceOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-science-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ScienceOutlined)))