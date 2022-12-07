(ns ogbe.fulcro.mui.icons.note
  #?(:cljs (:require
            ["@mui/icons-material/Note" :default Note]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-note
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Note)))