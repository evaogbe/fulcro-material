(ns ogbe.fulcro.mui.icons.tab-rounded
  #?(:cljs (:require
            ["@mui/icons-material/TabRounded" :default TabRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tab-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TabRounded)))