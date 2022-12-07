(ns ogbe.fulcro.mui.icons.space-bar-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SpaceBarSharp" :default SpaceBarSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-space-bar-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SpaceBarSharp)))