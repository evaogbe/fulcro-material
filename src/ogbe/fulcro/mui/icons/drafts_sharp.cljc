(ns ogbe.fulcro.mui.icons.drafts-sharp
  #?(:cljs (:require
            ["@mui/icons-material/DraftsSharp" :default DraftsSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-drafts-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DraftsSharp)))