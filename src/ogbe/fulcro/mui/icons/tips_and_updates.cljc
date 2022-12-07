(ns ogbe.fulcro.mui.icons.tips-and-updates
  #?(:cljs (:require
            ["@mui/icons-material/TipsAndUpdates" :default TipsAndUpdates]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tips-and-updates
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TipsAndUpdates)))