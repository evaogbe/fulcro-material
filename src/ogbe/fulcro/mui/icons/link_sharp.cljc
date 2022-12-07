(ns ogbe.fulcro.mui.icons.link-sharp
  #?(:cljs (:require
            ["@mui/icons-material/LinkSharp" :default LinkSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-link-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LinkSharp)))