(ns ogbe.fulcro.mui.icons.space-bar
  #?(:cljs (:require
            ["@mui/icons-material/SpaceBar" :default SpaceBar]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-space-bar
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SpaceBar)))