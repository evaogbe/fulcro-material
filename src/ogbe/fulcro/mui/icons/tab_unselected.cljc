(ns ogbe.fulcro.mui.icons.tab-unselected
  #?(:cljs (:require
            ["@mui/icons-material/TabUnselected" :default TabUnselected]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tab-unselected
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TabUnselected)))