(ns ogbe.fulcro.mui.icons.find-in-page-sharp
  #?(:cljs (:require
            ["@mui/icons-material/FindInPageSharp" :default FindInPageSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-find-in-page-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FindInPageSharp)))