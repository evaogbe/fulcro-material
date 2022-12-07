(ns ogbe.fulcro.mui.icons.launch-sharp
  #?(:cljs (:require
            ["@mui/icons-material/LaunchSharp" :default LaunchSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-launch-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LaunchSharp)))