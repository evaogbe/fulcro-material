(ns ogbe.fulcro.mui.icons.tab-unselected-rounded
  #?(:cljs (:require
            ["@mui/icons-material/TabUnselectedRounded" :default TabUnselectedRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tab-unselected-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TabUnselectedRounded)))