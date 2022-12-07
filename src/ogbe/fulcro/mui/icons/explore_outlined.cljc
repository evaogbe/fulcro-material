(ns ogbe.fulcro.mui.icons.explore-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ExploreOutlined" :default ExploreOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-explore-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ExploreOutlined)))