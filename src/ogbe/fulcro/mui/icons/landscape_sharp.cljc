(ns ogbe.fulcro.mui.icons.landscape-sharp
  #?(:cljs (:require
            ["@mui/icons-material/LandscapeSharp" :default LandscapeSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-landscape-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LandscapeSharp)))