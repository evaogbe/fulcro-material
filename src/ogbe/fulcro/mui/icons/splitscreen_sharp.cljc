(ns ogbe.fulcro.mui.icons.splitscreen-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SplitscreenSharp" :default SplitscreenSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-splitscreen-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SplitscreenSharp)))